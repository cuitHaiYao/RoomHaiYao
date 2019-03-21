package editpart;


import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import model.Employee;
import model.Enterprise;
import model.Service;

public class AppEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		// TODO Auto-generated method stub
		AbstractGraphicalEditPart part = null;
		
		if(model instanceof Enterprise) {
			part = new EnterprisePart();
		} else if(model instanceof Service) {
			part = new ServicePart();
		} else if(model instanceof Employee) {
			part = new EmployeePart();
		}
		
		part.setModel(model);
		return part;
	}
}
