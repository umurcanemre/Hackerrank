package jrQuestions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q2 {

    public static int numDuplicates(List<String> name, List<Integer> price, List<Integer> weight) {
        Set<Product> products = new HashSet<>();
        Set<Product> dupProducts = new HashSet<>();
        
        for(int i=0; i<name.size(); i++){
            Product p = new Product(name.get(i), price.get(i), weight.get(i));
            if(products.contains(p)){
                dupProducts.add(p);
            }
            else{
                products.add(p);
            }
        }
        return name.size() - products.size();
    }
    public static class Product{
        private String name;
        private int price;
        private int weight;
        public Product(String name, int price, int weight){
            this.name = name;
            this.price = price;
            this.weight = weight;
        }

        public String getName(){return name;}
        public int getPrice(){return price;}
        public int getWeight(){return weight;}

        @Override
        public boolean equals(Object o){
            if(o==this)
                return true;
            if(!(o instanceof Product))
                return false;
            Product p = (Product) o;
            return this.name.equals(p.getName()) && this.price == p.getPrice() && this.weight == p.getWeight();
        }
        @Override
        public int hashCode(){
            return (this.name.length()*17) + (this.price * 27) + (this.weight *37);
        }
    }

    public static int dumpQ(int i) {
    	if(i == 0) {
    		return 0;
    	}
    	else {
    		return dumpQ(i-1) +1;
    	}
    }
}
