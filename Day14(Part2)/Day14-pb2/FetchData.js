
const url = "https://dummy.restapiexample.com/api/v1/employees";

fetch(url)
  .then(response => {
    if (!response.ok) {
      throw new Error("Network response was not OK");
    }
    return response.json(); 
  })
  .then(data => {
    console.log("Employee Data:", data); 
  })
  .catch(error => {
    console.error("Fetch error:", error); 
  });
