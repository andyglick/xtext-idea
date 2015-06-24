package org.eclipse.xtext.idea.facet;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.eclipse.xtext.idea.util.IdeaWidgetFactory;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;

/**
 * Created by dhuebner on 19.06.15.
 */
public class GeneratorFacetForm<T extends GeneratorConfigurationState> {
	private JCheckBox compilerIsActivatedCheckBox;
	private TextFieldWithBrowseButton directory;
	private TextFieldWithBrowseButton testDirectory;
	private JCheckBox createDirectoryIfItCheckBox;
	private JCheckBox overwriteExistingFilesCheckBox;
	private JPanel rootPanel;
	private JCheckBox deleteGenerated;
	private Module module;

	public GeneratorFacetForm(Module module) {
		this.module = module;
		setupUI();
	}

	public void setData(GeneratorConfigurationState data) {
		createDirectoryIfItCheckBox.setSelected(data.isCreateDirectory());
		overwriteExistingFilesCheckBox.setSelected(data.isOverwriteExisting());
		deleteGenerated.setSelected(data.isDeleteGenerated());
		compilerIsActivatedCheckBox.setSelected(data.isActivated());
		directory.setText(data.getOutputDirectory());
		testDirectory.setText(data.getTestOutputDirectory());
	}

	public void getData(T data) {
		data.setCreateDirectory(createDirectoryIfItCheckBox.isSelected());
		data.setOverwriteExisting(overwriteExistingFilesCheckBox.isSelected());
		data.setDeleteGenerated(deleteGenerated.isSelected());
		data.setActivated(compilerIsActivatedCheckBox.isSelected());
		data.setOutputDirectory(directory.getText());
		data.setTestOutputDirectory(testDirectory.getText());
	}

	public boolean isModified(T data) {
		if (createDirectoryIfItCheckBox.isSelected() != data.isCreateDirectory())
			return true;
		if (overwriteExistingFilesCheckBox.isSelected() != data.isOverwriteExisting())
			return true;
		if (deleteGenerated.isSelected() != data.isDeleteGenerated())
			return true;
		if (compilerIsActivatedCheckBox.isSelected() != data.isActivated())
			return true;
		if (directory.getText() != null ? !directory.getText().equals(data.getOutputDirectory()) : data.getOutputDirectory() != null)
			return true;
		if (testDirectory.getText() != null ? !testDirectory.getText().equals(data.getTestOutputDirectory()) : data.getTestOutputDirectory() != null)
			return true;
		return false;
	}

	/**
	 * Method generated by IntelliJ IDEA GUI Designer >>> IMPORTANT!! <<< DO NOT edit this method OR call it in your
	 * code!
	 *
	 * @noinspection ALL
	 */
	private void setupUI() {
		rootPanel = new JPanel();
		BorderLayout borderLayout = new BorderLayout(0, 0);
		rootPanel.setLayout(borderLayout);
		rootPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		final JPanel mainPanel = new JPanel();
		GridBagLayout gridBagLayout = new GridBagLayout();
		mainPanel.setLayout(gridBagLayout);
		rootPanel.add(mainPanel, BorderLayout.NORTH);
		GridBagConstraints gbc;
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		mainPanel.add(IdeaWidgetFactory.createTitledSeparator("General"), gbc);

		compilerIsActivatedCheckBox = new JCheckBox();
		compilerIsActivatedCheckBox.setText("Compiler is activated");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.WEST;
		mainPanel.add(compilerIsActivatedCheckBox, gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		mainPanel.add(new JLabel(" "), gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		mainPanel.add(IdeaWidgetFactory.createTitledSeparator("Output Folder"), gbc);
		

		final JLabel label3 = new JLabel();
		label3.setText("Directory:");
		label3.setVerticalAlignment(0);
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.WEST;
		mainPanel.add(label3, gbc);
		
		directory = IdeaWidgetFactory.createBrowseField(module.getProject());
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		mainPanel.add(directory, gbc);
		
		
		final JLabel label4 = new JLabel();
		label4.setText("Test Directory:");
		label4.setVerticalAlignment(0);
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.WEST;
		mainPanel.add(label4, gbc);

		testDirectory = IdeaWidgetFactory.createBrowseField(module.getProject());
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		mainPanel.add(testDirectory, gbc);
		
		
		createDirectoryIfItCheckBox = new JCheckBox();
		createDirectoryIfItCheckBox.setText("Create directory if it doesn't exist");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.WEST;
		mainPanel.add(createDirectoryIfItCheckBox, gbc);
		
		overwriteExistingFilesCheckBox = new JCheckBox();
		overwriteExistingFilesCheckBox.setText("Overwrite existing files");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.WEST;
		mainPanel.add(overwriteExistingFilesCheckBox, gbc);
		
		deleteGenerated = new JCheckBox();
		deleteGenerated.setText("Delete generated files");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.WEST;
		mainPanel.add(deleteGenerated, gbc);
		
		
		final JPanel spacer = new JPanel();
		spacer.setLayout(new BorderLayout(0, 0));
		rootPanel.add(spacer, BorderLayout.CENTER);
	}

	/**
	 * @noinspection ALL
	 */
	public JComponent getRootComponent() {
		return rootPanel;
	}
}
