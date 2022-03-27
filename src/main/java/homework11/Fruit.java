package homework11;

import java.util.Arrays;
import java.util.Random;

public class Fruit {

        public enum Type {
            APPLE, ORANGE, CARROT
        }

        private final Color color;
        private final Type type;
        private final int weight;
        private final double pricePerKg;

        public Fruit(Color color, Type type, int weight, double pricePerKg) {
            this.color = color;
            this.type = type;
            this.weight = weight;
            this.pricePerKg = pricePerKg;
        }

        public Color getColor() {
            return color;
        }


        public Type getType() {
            return type;
        }


        public int getWeight() {
            return weight;
        }


        public double getPricePerKg() {
            return pricePerKg;
        }


        @Override
        public String toString() {
            return "Fruit{" +
                    "color=" + color +
                    ", type=" + type +
                    ", weight=" + weight +
                    ", pricePerKg=" + pricePerKg +
                    '}';
        }
}
