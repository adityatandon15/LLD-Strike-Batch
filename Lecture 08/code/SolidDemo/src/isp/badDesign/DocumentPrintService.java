package isp.badDesign;

public class DocumentPrintService {

    private final OfficeMachine machine;

    public DocumentPrintService(OfficeMachine machine) {
        this.machine = machine;
    }

    public void printDocument(String document) {
        machine.print(document);
    }
}
