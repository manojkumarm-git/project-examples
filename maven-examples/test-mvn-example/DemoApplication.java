import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;

public class DemoApplication {

    private final static org.apache.log4j.Logger logger = Logger.getLogger(DemoApplication.class);


    public static void main(String[] args) {
        org.dom4j.DocumentFactory documentFactory = new DocumentFactory();
        final Document document = documentFactory.createDocument();

        if (document.hasContent()) {
            logger.debug("document has content");
        } else {

            logger.debug("document has no content");
        }

    }
