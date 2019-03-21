package editpart;

import org.eclipse.draw2d.IFigure;

import java.beans.PropertyChangeEvent;
import java.util.List;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import editpolicy.AppEditLayoutPolicy;
import figure.ServiceFigure;
import model.Node;
import model.Service;


public class ServicePart extends  AppAbstractEditPart {

	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		IFigure figure = new ServiceFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new AppEditLayoutPolicy());
	}
	
	protected void refreshVisuals() {
		ServiceFigure figure = (ServiceFigure)getFigure();
		Service model = (Service)getModel();
		
		figure.setName(model.getName());
		figure.setEtage(model.getEtage());
		figure.setLayout(model.getLayout());
	}
	
	public List<Node> getModelChildren() {
		return ((Service)getModel()).getChildrenArray();
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		if(evt.getPropertyName().equals(Node.PROPERTY_LAYOUT)) refreshVisuals();
	}

}
