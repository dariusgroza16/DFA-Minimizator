
public class Stare {
  int index;
  int stare0;
  int stare1;
  boolean finala;
  public Stare() {
	  this.index = 0;
	  this.stare0 = 0;
	  this.stare1 = 0;
	  this.finala = false;
  }
  public Stare(int index, int stare0, int stare1, boolean finala) {
	  this.index = index;
	  this.stare0 = stare0;
	  this.stare1 = stare1;
	  this.finala = finala;
  }
public int getIndex() {
	return index;
}
public void setIndex(int index) {
	this.index = index;
}
public int getStare0() {
	return stare0;
}
public void setStare0(int stare0) {
	this.stare0 = stare0;
}
public int getStare1() {
	return stare1;
}
public void setStare1(int stare1) {
	this.stare1 = stare1;
}
public boolean isFinala() {
	return finala;
}
public void setFinala(boolean finala) {
	this.finala = finala;
}
  public String toString() {
	  return this.index + " " + this.stare0 + " " + this.stare1 + " " + this.finala;
  }
}
