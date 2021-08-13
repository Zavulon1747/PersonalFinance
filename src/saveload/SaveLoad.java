package saveload;

import settings.Settings;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class SaveLoad {

    public void load(SaveData sd) {
        try {
            JAXBContext context = JAXBContext.newInstance(Wrapper.class);
            Unmarshaller um = context.createUnmarshaller();
            Wrapper wrapper = (Wrapper) um.unmarshal(Settings.getFileSave());
            sd.setAccounts(sd.getAccounts());
            sd.setArticles(sd.getArticles());
            sd.setTransactions(sd.getTransactions());
            sd.setTransfers(sd.getTransfers());
            sd.setCurrencies(sd.getCurrencies());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void save(SaveData sd) {
        try {
            JAXBContext context = JAXBContext.newInstance(Wrapper.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Wrapper wrapper = new Wrapper();

            wrapper.setAccounts(sd.getAccounts());
            wrapper.setArticles(sd.getArticles());
            wrapper.setTransactions(sd.getTransactions());
            wrapper.setTransfers(sd.getTransfers());
            wrapper.setCurrencies(sd.getCurrencies());

            m.marshal(wrapper, Settings.getFileSave());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
