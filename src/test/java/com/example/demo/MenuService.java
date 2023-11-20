package com.example.demo;

import java.util.List;

public interface MenuService {
	void addMenu(Menu menu);

	void addMenus(List<Menu> menus);

	void updateMenu(Menu menu);

	Menu findByName(String name);

	List<Menu> findAll();
}
