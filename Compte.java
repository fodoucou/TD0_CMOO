import java.util.Date;

public abstract class Compte {
   /**
    * <pre>
    *           1..*     1..1
    * Compte ------------------------- Client
    *           compte        &lt;       client
    * </pre>
    */
   private Client client;
   
   public void setClient(Client value) {
      this.client = value;
   }
   
   public Client getClient() {
      return this.client;
   }
   
   private String numero;
   
   private void setNumero(String value) {
      this.numero = value;
   }
   
   private String getNumero() {
      return this.numero;
   }
   
   private double solde;
   
   private void setSolde(double value) {
      this.solde = value;
   }
   
   private double getSolde() {
      return this.solde;
   }
   
   private Date dateOuverture;
   
   private void setDateOuverture(Date value) {
      this.dateOuverture = value;
   }
   
   private Date getDateOuverture() {
      return this.dateOuverture;
   }
   
   public double crediter(double somme) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   public double debiter(double somme) {
      // TODO implement this operation
      throw new UnsupportedOperationException("not implemented");
   }
   
   }
