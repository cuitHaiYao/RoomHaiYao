package command;

import org.eclipse.draw2d.geometry.Rectangle;

import model.Service;

public class ServiceChangeLayoutCommand extends AbstractLayoutCommand {
	private Service model;
	private Rectangle layout;
	
	public void execute() {
		model.setLayout(layout);
	}

	@Override
	public void setConstraint(Rectangle rect) {
		// TODO Auto-generated method stub
		this.layout = rect;
	}

	@Override
	public void setModel(Object model) {
		// TODO Auto-generated method stub
		this.model = (Service)model;
	}
}
