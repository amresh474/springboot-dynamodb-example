/**
 * 
 */
package dynamodb.example.entity;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author amreshkumar
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument

public class Department implements Serializable {

	@DynamoDBAttribute
	private String departmentName;

	@DynamoDBAttribute
	private String departmentCode;

}
