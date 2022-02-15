package by.yahimovich.task06pattern.entity;

public abstract class SimplePart {

    private String item;

    public SimplePart(String item) {
        this.item = item;
    }

    public abstract boolean isWord();

    public abstract boolean isSpace();

    public abstract boolean isPunctuation();

    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return item;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((item == null) ? 0 : item.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        SimplePart other = (SimplePart) object;

        return item.equals(other.item);
    }
}
