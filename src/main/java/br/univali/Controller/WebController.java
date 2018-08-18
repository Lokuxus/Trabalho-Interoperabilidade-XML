package br.univali.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.univali.Model.Curso;

@RestController
@RequestMapping("/")
public class WebController {
	final static Logger logger = LogManager.getLogger(WebController.class.getName());
	@Autowired
	Gson json = new Gson();


	
	@RequestMapping(value="/{nome}",method = RequestMethod.POST, produces = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	public void escreveXML(HttpEntity<String> entity, @PathVariable("nome") String arquivo) throws JAXBException, FileNotFoundException {
		Curso curso = json.fromJson(entity.getBody(), Curso.class);
		JAXBContext jaxbContext = JAXBContext.newInstance(Curso.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(curso, new File(arquivo+".xml"));
		marshaller.marshal(curso, System.out);
	}
	
	@RequestMapping(value = "/{nome}", method = RequestMethod.GET, produces = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	public String leXML(@PathVariable("nome") String arquivo) throws JAXBException, FileNotFoundException {
		
        JAXBContext context = JAXBContext.newInstance(Curso.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Curso curso = (Curso) unmarshaller.unmarshal(new File(arquivo+".xml"));
        
		return json.toJson(curso);
        
	}
}
