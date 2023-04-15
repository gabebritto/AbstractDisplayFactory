package fabrica.abstrata;

public class XiaomiDisplayFactory implements DisplayFactory{

	@Override
	public Display createDisplay(double inches) {
		Display display = new XiaomiDisplay(inches);
		display.assemble();
		qualityTest(display);
		return display;
	}

	@Override
	public Display createTabletDisplay(double inches) {
		Display display = new XiaomiTabletDisplay(inches);
		display.assemble();
		qualityTest(display);
		return display;
	}

	@Override
	public FoldableDisplay createFoldableDisplay(double inches) throws Exception {
		FoldableDisplay foldable =  new XiaomiFoldableDisplay(inches);
		foldable.assemble();
		qualityFoldable(foldable);
		return foldable;
	}

}
