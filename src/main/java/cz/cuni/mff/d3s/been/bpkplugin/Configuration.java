package cz.cuni.mff.d3s.been.bpkplugin;

import java.io.File;
import java.util.Collection;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.maven.artifact.Artifact;

import cz.cuni.mff.d3s.been.bpk.BpkIdentifier;

/**
 * 
 * 
 * @author Tadeas Palusga
 * 
 */
public class Configuration {

	public String groupId;
	public String bpkId;
	public String version;
	public String finalName;
	public File binary;
	public File buildDirectory;
	public File packageJarFile;
	public Collection<FileItem> filesToArchive;
	public Collection<Artifact> artifacts;
	public Collection<BpkIdentifier> bpkDependencies;
	public File[] taskDescriptors;
	public File[] taskContextDescriptors;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
