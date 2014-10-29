package org.bosphorus.core;

import java.util.List;

public interface IComponent {
	List<IComponent> getChildComponents();
}
