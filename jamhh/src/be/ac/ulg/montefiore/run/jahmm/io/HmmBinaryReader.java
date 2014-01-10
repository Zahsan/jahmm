/*
 * Copyright (c) 2004-2009, Jean-Marc François. All Rights Reserved.
 * Licensed under the New BSD license.  See the LICENSE file.
 */
package be.ac.ulg.montefiore.run.jahmm.io;

import be.ac.ulg.montefiore.run.jahmm.Hmm;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.logging.Logger;

/**
 * This class can read Hidden Markov Models from a byte stream.
 * <p>
 * The HMM objects are simply deserialized. HMMs could thus be unreadable using
 * a different release of this library.
 */
public class HmmBinaryReader {

    /**
     * Reads a HMM from a byte stream.
     *
     * @param stream Holds the byte stream the HMM is read from.
     * @return The {@link be.ac.ulg.montefiore.run.jahmm.Hmm HMM} read.
     * @throws java.io.IOException
     */
    static public Hmm<?> read(InputStream stream)
            throws IOException {
        ObjectInputStream ois = new ObjectInputStream(stream);

        try {
            return (Hmm) ois.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
<<<<<<< HEAD

    private HmmBinaryReader() {
    }
    private static final Logger LOG = Logger.getLogger(HmmBinaryReader.class.getName());
=======
>>>>>>> parent of e8b9e16... refactorings
}
