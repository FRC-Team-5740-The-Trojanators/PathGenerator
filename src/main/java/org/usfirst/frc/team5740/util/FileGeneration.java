package org.usfirst.frc.team5740.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.team254.lib.trajectory.Path;
import com.team254.lib.trajectory.io.JavaSerializer;
import com.team254.lib.trajectory.io.TextFileSerializer;

import org.usfirst.frc.team5740.Main;



/**
 * this class is to Generate java and txt file for paths that are Generated
 * 
 * @author nicholas blackburn
 * @param pathName location of file path
 * @param path path for path generation
 */
//TODO: add correct User location to store generated paths
public class FileGeneration {


	public static void writeFiles(final String javaDirectory, final String fileName, final Path path) {


		// Outputs to the directory supplied as the first argument.
		final TextFileSerializer ts = new TextFileSerializer();
		final String serializedtext = ts.serialize(path);
		// System.out.print(serialized);
		final String fullpathtext = joinPath(javaDirectory, fileName + ".txt");
		if (!writeFile(fullpathtext, serializedtext)) {
			System.err.println(fullpathtext + " could not be written!!!!1");
			System.exit(1);
		} else {
			Main.logger.info("Wrote " + fullpathtext);
			Main.logger.warning("FINISHED");
			

		}

	}

	private static boolean writeFile(final String path, final String data) {
		try {
			final File file = new File(path);

			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			final FileWriter fw = new FileWriter(file.getAbsolutePath());
			final BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data);
			bw.close();
		} catch (final IOException e) {
			return false;
		}

		return true;
	}

	public static String joinPath(final String path1, final String path2) {
		final File file1 = new File(path1);
		final File file2 = new File(file1, path2);
		return file2.getPath();
	}
}