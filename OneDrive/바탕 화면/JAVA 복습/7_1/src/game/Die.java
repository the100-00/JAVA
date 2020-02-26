package game;

public class Die {
	int num;
	Die(){	num = 1; }
	int roll() { return (int)(Math.random()*6)+1; }
	void setValue(int v) { num = v; }
	int getValue() { return roll(); }
	public String toString() { return "현재 주사위 상태 : "+getValue();}
}
