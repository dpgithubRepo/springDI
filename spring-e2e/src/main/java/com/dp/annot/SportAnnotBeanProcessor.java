package com.dp.annot;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Component
public class SportAnnotBeanProcessor implements BeanFactoryAware, DisposableBean, BeanPostProcessor  {
	
	
	private BeanFactory beanFactory;
	
	private List<Object> protoTypeBeans = new LinkedList<>();
	
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		if(beanFactory.isPrototype(beanName)) {
			synchronized (protoTypeBeans) {
				protoTypeBeans.add(bean);
			}
		}
		return bean;
	}

	@Override
	public void destroy() throws Exception {
		synchronized (protoTypeBeans) {
			protoTypeBeans.forEach(bean->{
				if(bean instanceof DisposableBean) {
					DisposableBean disposableBean = (DisposableBean)bean;
					try {
						disposableBean.destroy();
					} catch (Exception e) {
						e.printStackTrace();
					}
			}
		});
			
			protoTypeBeans.clear();
		}
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		
	}

}
