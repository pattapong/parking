package parking.data;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DataAccess {

	private MongoClient mongoClient;

	private MongoDatabase db;

	private static DataAccess instance;

	public static DataAccess getInstance() {

		if (null == instance) {
			instance = new DataAccess();
		}

		return instance;
	}

	public void init(final String mongoDbName, final String databaseName) {

		mongoClient = new MongoClient(mongoDbName, 27017);

		db = mongoClient.getDatabase(databaseName);

	}

	public MongoCollection<Document> getCollection(final String collectionName) {
		return db.getCollection(collectionName);

	}

}
