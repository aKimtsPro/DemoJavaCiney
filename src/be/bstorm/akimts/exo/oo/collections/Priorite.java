package be.bstorm.akimts.exo.oo.collections;

public enum Priorite {
    TRANQUILLE, // 0
    ATTENTION, // 1
    CODE_ROUGE; // 2

    public boolean isGreaterThan(Priorite priorite){
        return this.ordinal() > priorite.ordinal();
    }
}
