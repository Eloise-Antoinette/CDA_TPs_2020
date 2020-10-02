package TP5;

class Robot {
	String status;
	int speed;
	float temperature;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	void checkTemperature() {
		if (temperature > 660) {
			status = "retour au bercail";
			speed = 5;
		}
	}

	void showAttributes() {
		System.out.println("Statut : " + status);
		System.out.println("Vitesse : " + speed);
		System.out.println("Température : " + temperature);
	}

}