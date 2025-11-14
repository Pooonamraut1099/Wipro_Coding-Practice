const button = document.getElementById("fetch-user-btn");
const userInfoDiv = document.getElementById("user-info");

button.addEventListener("click", () => {
  fetch("https://randomuser.me/api/")
    .then(response => {
      if (!response.ok) {
        throw new Error("Network response was not OK");
      }
      return response.json();
    })
    .then(data => {
      const user = data.results[0];
      const fullName = `${user.name.title} ${user.name.first} ${user.name.last}`;
      const email = user.email;
      const picture = user.picture.large;

      userInfoDiv.innerHTML = `
        <h2>${fullName}</h2>
        <p>Email: ${email}</p>
        <img src="${picture}" alt="User Picture">
      `;
    })
    .catch(error => {
      console.error("Fetch error:", error);
      userInfoDiv.innerHTML = "<p>Failed to fetch user data.</p>";
    });
});
