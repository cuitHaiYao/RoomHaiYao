package editpart;

import java.beans.PropertyChangeListener;


import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import model.Node;


public abstract class AppAbstractEditPart extends AbstractGraphicalEditPart implements PropertyChangeListener {

//	@Override
//	protected IFigure createFigure() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	protected void createEditPolicies() {
//		// TODO Auto-generated method stub
//
//	}
	
	public void activate() {
		super.activate();
		((Node)getModel()).addPropertyChangeListener(this);
	}
	
	public void deactivate() {
		super.deactivate();
		((Node)getModel()).removePropertyChangeListener(this);
	}

}
