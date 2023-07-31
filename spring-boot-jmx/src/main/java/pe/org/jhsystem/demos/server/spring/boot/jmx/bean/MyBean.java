package pe.org.jhsystem.demos.server.spring.boot.jmx.bean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName="MyManagedBeans:name=myIVABean", description="Bean que controla el IVA")
public class MyBean {

	private String pais;
	private double IVA;
	
	@ManagedAttribute
	public String getPais() {
		return this.pais;
	}
	
	@ManagedAttribute
	public double getIVA() {
		return this.IVA;
	}
	
	@ManagedAttribute(description="Pais del IVA")
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	@ManagedAttribute(description="Porcentaje del IVA")
	public void setIVA(double IVA) {
		this.IVA = IVA;
	}
	
	@ManagedOperation(description="Calcula el IVA de una cantidad dada")
	@ManagedOperationParameters({
		@ManagedOperationParameter(name = "cantidad", description = "Precio")
	})
	public double getResultado(double cantidad) {
		return cantidad * (this.IVA/100);
	}
}
