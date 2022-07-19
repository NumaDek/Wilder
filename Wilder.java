public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public boolean isAware() { return aware; }
    public void setAware(boolean aware) { this.aware = aware; }

    public void whoAmI() {
        System.out.format("Je m'appelle %s", this.firstname);

        if (this.aware)
            System.out.println(" et je suis aware");
        else
            System.out.println(" et je ne suis pas aware");
    }
}