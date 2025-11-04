package model.inheritance;

public class SoftwareWorker extends Worker {
    private String programLanguage;

    public String getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
        this.programLanguage = programLanguage;
    }

}