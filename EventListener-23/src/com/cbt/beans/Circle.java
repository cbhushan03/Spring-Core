package com.cbt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher publisher;
	
	private Point center;
	@Autowired
	private MessageSource messageSource;
		
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void draw(){
		/*System.out.println("Circle is drawing...");*/
		System.out.println(this.messageSource.getMessage("drawing.circle", null,"Default greeting",null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(),center.getY()},"Default greeting",null));
		/*System.out.println("Circle: Point is: ("+center.getX()+" , "+center.getY()+")");*/
		publisher.publishEvent(new DrawEvent(this));
	}

	public Point getCenter() {
		return center;
	}
	
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initializeCircle(){
		System.out.println("Initialization of Circle");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destruction of Circle");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher = publisher;
	}
	
}
