package patterns.structural.adapter.creatingOurOwn;

import java.util.StringTokenizer;

public class EmployeeCSV {
    private int id;
    private String firstname;
    private String lastlame;
    private String emailAddress;

   public EmployeeCSV(String values){
       StringTokenizer tokenizer = new StringTokenizer(values, ",");
       if (tokenizer.hasMoreElements()){
           id = Integer.parseInt(tokenizer.nextToken());
       }
       if (tokenizer.hasMoreElements()){
           firstname = tokenizer.nextToken();
       }
       if (tokenizer.hasMoreElements()){
           lastlame = tokenizer.nextToken();
       }
       if (tokenizer.hasMoreElements()){
           emailAddress = tokenizer.nextToken();
       }
   }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastlame() {
        return lastlame;
    }

    public void setLastlame(String lastlame) {
        this.lastlame = lastlame;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
