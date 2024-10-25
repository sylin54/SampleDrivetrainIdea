package frc.robot.utils.drivetrain;

import com.ctre.phoenix6.mechanisms.swerve.SwerveDrivetrain.OdometryThread;

import edu.wpi.first.math.Matrix;
import edu.wpi.first.math.estimator.SwerveDrivePoseEstimator;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.kinematics.SwerveModulePosition;
import edu.wpi.first.math.numbers.N1;
import edu.wpi.first.math.numbers.N3;

/*
Author: Ben

Purpose: A pose estimator that uses more intelligent methods detailed in my notes on orbits lectures
 */
public class VortechsPoseEstimator extends SwerveDrivePoseEstimator{

    //add some new constructors
    public VortechsPoseEstimator(SwerveDriveKinematics kinematics, Rotation2d gyroAngle,
            SwerveModulePosition[] modulePositions, Pose2d initialPoseMeters, Matrix<N3, N1> stateStdDevs,
            Matrix<N3, N1> visionMeasurementStdDevs) {
        super(kinematics, gyroAngle, modulePositions, initialPoseMeters, stateStdDevs, visionMeasurementStdDevs);
        //TODO Auto-generated constructor stub
    }

    //figure out this problem
    // public class VortechsOdometryThread extends OdometryThread {

    // }
    
}
