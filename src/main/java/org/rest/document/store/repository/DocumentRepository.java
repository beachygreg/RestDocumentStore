package org.rest.document.store.repository;

import com.mongodb.gridfs.GridFSDBFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.gridfs.GridFsCriteria.whereFilename;

/**
 * User: greg
 * Date: 29/12/12
 * Time: 9:25 AM
 */
@Repository
public class DocumentRepository {

    @Autowired
    GridFsOperations operations;


    public void findFilesInGridFs() {
        List<GridFSDBFile> result = operations.find(query(whereFilename().is("filename.txt")));
    }


}
