<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${adverts}" var="advert">
    <table>
        <tr>
            <td>
                <span class="text">Maker</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.maker.maker}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">model</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.model.model}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">car body</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.carBody.carBody}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">transmission</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.transmission.transmission}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">fuel type</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.fuelType.fuelType}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">condition</span>
            </td>
            <td>
                <span class="text">${advert.car.ownerInfo.condition.condition}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">cubic capacity</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.capacity}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">year</span>
            </td>
            <td>
                <span class="text">${advert.car.makerInfo.year}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">mileage</span>
            </td>
            <td>
                <span class="text">${advert.car.ownerInfo.mileage}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">price</span>
            </td>
            <td>
                <span class="text">${advert.car.ownerInfo.price}</span>
            </td>
        </tr>
        <tr>
            <td>
                <span class="text">description</span>
            </td>
            <td><span class="text">${advert.car.ownerInfo.description}</span></td>
        </tr>
        <tr>
            <td>
                <span class="text">added</span>
            </td>
            <td>
                <span class="text">${advert.users.name}</span>
            </td>
        </tr>
    </table>
    <hr/>
</c:forEach>

