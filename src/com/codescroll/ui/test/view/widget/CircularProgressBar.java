package com.codescroll.ui.test.view.widget;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ProgressBar;

public class CircularProgressBar extends Canvas {

	private ResourceManager resourceManager;

	public CircularProgressBar(Composite parent, int style) {
		super(parent, style);
		resourceManager = new LocalResourceManager(JFaceResources.getResources(), this);
		
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				paint(e);
			}
		});
		
	}

	protected void paint(PaintEvent event) {
		ProgressBar progress= new ProgressBar(this, SWT.NONE);

		progress.addPaintListener(new PaintListener() {
			
			@Override
			public void paintControl(PaintEvent e) {
				
			}
		});
	}

}
