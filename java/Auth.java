
public class AuthSession implements Serializable{

    private boolean log;
    private String name;

    /**
     * @return boolean return the logado
     */
    public boolean isLog() {
        System.out.println("isLogged " + isLog);
        return logado;
    }

    /**
     * @param logado the logado to set
     */
    public void setLog(boolean log) {
        this.logado = logado;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}