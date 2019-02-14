package org.springframework.samples.jpetstore;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.samples.jpetstore.services.PetStoreService;

import java.util.List;

public class UseXmlBeanDefinitionReader {
    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("services.xml", "daos.xml");
        context.refresh();
        // retrieve configured instance
        PetStoreService service = context.getBean("petStore", PetStoreService.class);
        // use configured instance
        List<String> userList = service.getUsernameList();
    }
}
