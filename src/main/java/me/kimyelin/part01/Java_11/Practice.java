package me.kimyelin.part01.Java_11;// Practice
// 아래 GreenOrc 클래스와 NPCSystem, UserSystem 인터페이스를 이용하여
// OrkNPC1, OrkUser1 클래스를 만들어보세요.


abstract class GreenOrc {
    public final String SKIN_COLOR = "녹색";
    public int health;
    public int attackDamage;
    public int defense;

    public abstract void setHealth();
    public abstract void setDamage();
    public abstract void setDefense();
}

interface NPCSystem {
    public abstract void conversationSystem();
    public abstract void questionSystem();
}

interface UserSystem {
    public abstract void partySystem();
    public abstract void tradeSystem();
}

// OrkNPC1 클래스
class OrkNPC1 extends GreenOrc implements NPCSystem{
    @Override
    public void setHealth() {
        this.health = 100;
    }

    @Override
    public void setDamage() {
        this.attackDamage = 10;
    }

    @Override
    public void setDefense() {
        this.defense = 5;
    }

    @Override
    public void conversationSystem() {
        System.out.println("hello");
        System.out.println("how are you today?");
    }

    @Override
    public void questionSystem() {
        System.out.println("new Quest!");
        System.out.println("Quest Complete!");
    }
}

// OrkUser1 클래스
class OrkUser1 extends GreenOrc implements UserSystem{
    @Override
    public void setHealth() {
        this.health = 200;
    }

    @Override
    public void setDamage() {
        this.attackDamage = 20;
    }

    @Override
    public void setDefense() {
        this.defense = 10;
    }

    @Override
    public void partySystem() {
        System.out.println("Join Party");
        System.out.println("Join Accept");
    }

    @Override
    public void tradeSystem() {
        System.out.println("Transaction!");
        System.out.println("Complete Transaction!");
    }
}


public class Practice {
    public static void main(String[] args) {
        // Test code
        // No test code
    }
}
