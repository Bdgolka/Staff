public enum contract {
	TEMPORARY(0), TRAINING(1), INDEFINITE(2);

	private final int id;

	private contract(int id) {
		this.id = id;
	}
	
	public int getId(){
		return id;
	}

}
