public enum Status {
    OPEN, TODO, IN_PROGRESS, DONE, VERIFIED;

    public Status advance() {
        int ordinal = this.ordinal();
        return values().length - 1 > ordinal ? values()[ordinal + 1] : this;
    }

    public Status revert() {
        int ordinal = this.ordinal();
        return ordinal > 0 ? values()[ordinal - 1] : this;
    }
}
