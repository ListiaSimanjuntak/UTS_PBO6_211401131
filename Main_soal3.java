package src;

public class Character {
    String nama;
    int heal;
    String weapon;
    int attackP;
    int mana;
    
    public Character(String nama, int heal, String weapon, int attackP, int mana) { 
        this.nama = nama;
        this.heal = heal; 
        this.weapon = weapon;
        this.attackP = attackP;
        this.mana = mana;
        print();
    }
    
    public void attack() {
        this.mana -= 5;
        System.out.println(this.nama + " menyerang si sotong");
        System.out.println("sotong terkena damage sebanyak " + this.attackP);
    }
    
    public void demage(int attackP) {
        System.out.println(this.nama + " terkena damage sebanyak " + attackP);
        this.heal -= attackP;
    }
    
    public void print() {
        System.out.println("Nama: " + this.nama);  
        System.out.println("Heal: " + this.heal);
        System.out.println("Weapon: " + this.weapon);
        System.out.println("Attack power: " + this.attackP);
        System.out.println("Mana: " + this.mana);
    }
}

public class Main {
    public static void main(String[] args) {
        Character character1 = new Character("ucup", 100, "pedang excalibur", 5, 100);
        character1.attack();
        character1.demage(10);
        character1.print();
    }
}
