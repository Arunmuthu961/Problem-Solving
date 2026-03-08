
const ACCESS_KEY = pLJREM2lXGDBmRnqwczAC-o9-ySQ85PLVhYl7Pj8kG8

async function searchImages() {
  const query = document.getElementById("searchInput").value;
  const imageContainer = document.getElementById("imageContainer");
  
  imageContainer.innerHTML = ""; // clear old images

  if (query === "") {
    alert("Please enter a search term");
    return;
  }
  const url = 'https://api.unsplash.com/search/photos?page=${page}1&query=${keyword}&client_id=${ACCESS_KEY}';

  try {
    const response = await fetch(url);
    const data = await response.json();

    data.results.forEach(photo => {
      const img = document.createElement("img");
      img.src = photo.urls.small;
      img.alt = photo.alt_description;
      img.style.width = "250px";
      img.style.margin = "10px";
      img.style.borderRadius = "10px";

      imageContainer.appendChild(img);
    });

  } catch (error) {
    console.error("Error fetching images:", error);
  }
}