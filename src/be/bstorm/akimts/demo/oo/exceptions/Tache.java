package be.bstorm.akimts.demo.oo.exceptions;

import java.time.LocalDate;

public class Tache {

    private final LocalDate deadline;
    private String description;
    private boolean fait;

    public Tache(LocalDate deadline, String description) {
        this.deadline = deadline;
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFait() {
        return fait;
    }

    public void setFait(boolean fait) {
        this.fait = fait;
    }
}
