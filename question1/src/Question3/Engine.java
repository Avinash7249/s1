package Question3;

public class Engine {
	
		int rmp;
        int Power;
		String manufacturer;
		Boolean hasTurbo=false;
		
		public void hasturbo(Boolean hasTurbo) {
			if( hasTurbo==true) {
				this.hasTurbo=true;
			}
		}
		public void setRmp(int rmp) {
			this.rmp=rmp;
		}
		public int getRmp() {
			return rmp;
		}
		
		public void setPower(int Power) {
			this.Power=Power;
		}
		public int getPower() {
			return Power;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer=manufacturer;
		}
		public String getManufacturer() {
			return manufacturer;
		}
		
	}


