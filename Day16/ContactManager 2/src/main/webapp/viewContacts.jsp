<%@ page import="java.util.*, com.contactmanager.model.Contact" %>
<%
    List<Contact> contacts = (List<Contact>) request.getAttribute("contacts");
    if (contacts == null) {
        contacts = new ArrayList<Contact>();
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Saved Contacts</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">
    <h2>Your Contact List</h2>

    <%
        if (contacts.isEmpty()) {
    %>

        <div class="error-msg">
            No contacts available yet. Add a new one to get started.
        </div>

    <%
        } else {
    %>

        <div class="success-msg">
            Below are all the contacts currently saved in your list.
        </div>

        <table>
            <tr>
                <th>Name</th>
                <th>Phone</th>
                <th>Email</th>
            </tr>

            <%
                for (Contact c : contacts) {
            %>
            <tr>
                <td><%= c.getName() %></td>
                <td><%= c.getPhone() %></td>
                <td><%= c.getEmail() %></td>
            </tr>
            <%
                }
            %>
        </table>

    <%
        }
    %>

    <div style="text-align:center; margin-top:25px;">
        <button class="secondary" onclick="window.location.href='index.jsp'">
            Back to Home
        </button>
    </div>
    
</div>

</body>
</html>
