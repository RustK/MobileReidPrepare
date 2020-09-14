/* Заголовок заказа */
public class Order {
    public String numberDocument;
    private Integer idClient;
    private Integer idTT;

    public Order(String numberDocument) {
        this.numberDocument = numberDocument;
        this.idClient = 0;
        this.idTT = 0;
    }

    public Order(String numberDocument, Integer idClient) {
        this.numberDocument = numberDocument;
        this.idClient = idClient;
        this.idTT = 0;
    }

    public Order(String numberDocument, Integer idClient, Integer idTT) {
        this.numberDocument = numberDocument;
        this.idClient = idClient;
        this.idTT = idTT;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public Integer getIdTT() {
        return idTT;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public void setIdTT(Integer idTT) {
        this.idTT = idTT;
    }

}
