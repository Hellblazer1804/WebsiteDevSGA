public class FountainClient {
  public static void main(String[] args) {
    WaterFountain wf = new WaterFountain("A-222", 987);
    WaterFountain wf2 = new WaterFountain("B-5", 1);
    System.out.println(wf.toString());
    wf.pourCup();
    System.out.println(wf.getCupsPoured());
    System.out.println(wf.equals(wf2));
    System.out.println(wf.equals(wf));
    System.out.println(WaterFountain.getTotalWaterFountains());
  }
}
