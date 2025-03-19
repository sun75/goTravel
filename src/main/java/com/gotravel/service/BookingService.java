package com.gotravel.service;

/**
 * @author: shh
 * @createTime: 2025/3/1910:15
 */
@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    // 创建订单（简单版本，无支付集成）
    public Booking createBooking(Long userId, Long routeId, int seats) {
        Booking booking = new Booking();
        booking.setUserId(userId);
        booking.setRouteId(routeId);
        booking.setSeats(seats);
        booking.setStatus("CONFIRMED");
        return bookingRepository.save(booking);
    }
}
