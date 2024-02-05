package task3;

import exeptions.ContainsABC;
import exeptions.EndWith1a2b;
import exeptions.StartWith555;

public  class Register {
    int documentProps = 0;
    private final Document[] documents = new Document[10];

    public void getDocumentProps(Document doc) {
        documents[documentProps] = doc;
        documentProps++;
    }

    public void saveDocument(String documentNum) throws ContainsABC, EndWith1a2b, StartWith555 {
        if (documentNum.contains("abc")) {
            throw new ContainsABC(ContainsABC.CONTAINS_WRONG);
        } else if (documentNum.startsWith("555")) {
            throw new StartWith555(StartWith555.START_WRONG);
        } else if (documentNum.endsWith("1a2b")) {
            throw new EndWith1a2b(EndWith1a2b.END_WRONG);
        }


            for (Document doc : documents) {
            if (doc != null && doc.getDocumentProps() == documentNum) {
                System.out.println(documentNum);
                break;
            }


        }
    }


    public void displayAllDocuments() {
        System.out.println("List of documents:\n");
        for (int i = 0; i < documentProps; i++) {
            documents[i].getDisplayInfo();
        }
    }
}

