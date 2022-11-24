package AimsProject.src.MainSrc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[20];
	private int qtyOrdered = 0;
	
	void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is already full");
		}
		else {
			this.itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		}
	}

	void addDigitalVideoDisc(DigitalVideoDisc [] disc) {
		for (int i = 0; i < disc.length; i++) {
			this.itemOrdered[qtyOrdered] = disc[i];
			qtyOrdered++;
			if (qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is already full");
				break;
			}
		}
		System.out.println("The disc has been added");
	}

	void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is already full");
		}
		else {
			this.itemOrdered[qtyOrdered] = disc1;
			qtyOrdered++;
			System.out.println("The disc1 has been added");
			if (qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is already full");
			}
			else {
				this.itemOrdered[qtyOrdered] = disc2;
				qtyOrdered++;
				System.out.println("The disc2 has been added");
			}
		}
	}
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is null");
		}else {
			for (int i = 0; i < qtyOrdered; i++) {
				if (this.itemOrdered[i] == disc) {
					this.itemOrdered[i] = this.itemOrdered[qtyOrdered - 1];
					this.itemOrdered[qtyOrdered - 1] = null;
					qtyOrdered--;
				}
			}
			System.out.println("The disc has been deleted");
		}
	}
	
	float totalCost() {
		float sum = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += this.itemOrdered[i].getCost();
		}
		return sum;
	}
}
