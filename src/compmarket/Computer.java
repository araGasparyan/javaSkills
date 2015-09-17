package compmarket;

public class Computer {
	HDD hdd = new HDD();
	 MotherBoard moth = new  MotherBoard();
	 RAM ram = new RAM();
         String pic;
         
	 public Computer(HDD hdd, MotherBoard moth, RAM ram, String pic) {
		super();
		this.hdd = hdd;
		this.moth = moth;
		this.ram = ram;
		this.pic = pic;
	}
	
	public HDD getHdd() {
		return hdd;
	}
        
	public void setHdd(HDD hdd) {
		this.hdd = hdd;
	}
        
	public MotherBoard getMoth() {
		return moth;
	}
        
	public void setMoth(MotherBoard moth) {
		this.moth = moth;
	}
        
	public RAM getRam() {
		return ram;
	}
        
	public void setRam(RAM ram) {
		this.ram = ram;
	}
        
	public String getPic() {
		return pic;
	}
        
	public void setPic(String pic) {
		this.pic = pic;
	}
	
	
	
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
        
	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", moth=" + moth + ", ram=" + ram
				+ ", pic=" + pic + "]";
	}
	

}
