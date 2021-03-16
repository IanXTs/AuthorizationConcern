# AuthorizationConcern
you will need javax.mail and twilio api to run the application 

# Description of features

AuthSessionExpiry: When a user is authenticated, a temporary session is created in which they can freely access objects that they have clearance for without needing to authenticate again.

AutomaticExpiry: The temporary session automatically expires after a set amount of time.

ManualExpiry: The user can manually close the authorization session.

GrantClearance: An administrator can grant clearance for a specific object for a user.

RevokeClearance: An administrator can revoke clearance for a specific object for a user.

ClearanceVerification: Check what clearance a user has.

ClearanceLevel: Administrators can create various clearance levels which can be granted to users. Each clearance level has different properties such as permissions.

Clearance Limit: Limit how many times a user can simultaneously access an object.

Authentication: Authenticate a user

UserPassword: Authenticate using a combination of username and password to authenticate a user.

2FA: Authenticate using 2-factor authentication.

SMS: Send code to mobile phone via SMS to authenticate.

Email: Send code to email to authenticate.

Itemized: Structure of the information base that is checked by manager to see whether a user has access to a certain data set on a per item basis

Hierarchical: Structure of the information base that is checked by manager to see whether a user has access to a certain data set based on whether that user is of a level - with or above - the data set.


# Impact model justifications

![image](https://user-images.githubusercontent.com/35807234/111078582-90a72500-84cc-11eb-846d-e6d260fafc9f.png)

#### Increase Access Control
RevokeClearance and GrantClearance have equally high contribution to Increase Access Control because both features allow administrators to directly control who has access to what. Increase Access Information has lower contribution because while this helps an administrator to manage access control by having more information on the type of access each user has, it does not have as much of an impact as being able to revoke and grant clearance.

ClearanceVerification has a high contribution to Increase Access Information because it allows an administrator to verify which users have clearance. ClearanceLevel has equally high contribution because an administrator is able to see what clearance level a user has and what permissions a certain clearance level has. ClearanceLimit has a lower contribution because it does not provide as much information about a user’s access permissions.

#### Increase User Convenience
As for the contributions of the “Increase User Convenience” impact model, the justifications are as follows. 

The Manual Expiry feature improves security overall because it prevents anyone to directly have access to your account without having to hack through the authorization and authentication layers. Furthermore, Two-factor Authentication (2FA) comes in second for improving security because it adds another layer of authentication before being authorized, hence adding additional security. Auth Session expiry comes in third for adding security because it will prompt the user once in a while to authenticate once more before being authorized. Lastly, Username and Password come in last when compared with the former three features.

Users like to be authorized as quickly as possible, therefore we deemed entering your username and password a negative contribution to Improve User Authentication Convenience. Moreover, 2FA adds an extra step to the authentication process before being authorized therefore it has a negative weight three times more than UserPass.

Being authorized to access more content (Grant Clearance) contributes positively towards Increase Content Access goal. Revoke Clearance contributes equally negatively to the same goal.

Finally, Improve Security goal contributes a total of 10 points to the top level goal Increase User Convenience because it is extremely convenient for users to feel that their accounts are secure, while Increase Content Access and Improve User Authentication Convenience have a less but equal positive contribution of 5.


