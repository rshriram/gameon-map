package net.wasdev.gameon.map.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Coordinates {

    private int x;
    private int y;

    public Coordinates() {}

    @JsonIgnore
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString()  {
      StringBuilder sb = new StringBuilder();
      sb.append("class Coordinates {\n");
      sb.append("  x: ").append(x).append("\n");
      sb.append("  y: ").append(y).append("\n");
      sb.append("}\n");
      return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Coordinates other = (Coordinates) obj;
        return (x == other.x && y == other.y);
    }
}